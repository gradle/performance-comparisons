package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_255 {
    private final Production52_255 production = new Production52_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}