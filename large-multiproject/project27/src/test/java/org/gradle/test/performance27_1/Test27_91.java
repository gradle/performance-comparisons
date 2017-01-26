package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_91 {
    private final Production27_91 production = new Production27_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}