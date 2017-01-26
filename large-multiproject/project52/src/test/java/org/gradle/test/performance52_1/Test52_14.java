package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_14 {
    private final Production52_14 production = new Production52_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}