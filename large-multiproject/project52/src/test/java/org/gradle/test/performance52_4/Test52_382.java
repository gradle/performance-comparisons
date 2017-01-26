package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_382 {
    private final Production52_382 production = new Production52_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}