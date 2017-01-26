package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_347 {
    private final Production27_347 production = new Production27_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}