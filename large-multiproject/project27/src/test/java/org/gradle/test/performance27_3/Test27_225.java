package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_225 {
    private final Production27_225 production = new Production27_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}