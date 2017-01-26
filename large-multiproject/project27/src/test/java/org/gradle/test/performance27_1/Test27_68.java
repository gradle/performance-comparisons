package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_68 {
    private final Production27_68 production = new Production27_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}