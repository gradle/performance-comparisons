package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_338 {
    private final Production27_338 production = new Production27_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}