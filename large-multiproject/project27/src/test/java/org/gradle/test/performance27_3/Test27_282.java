package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_282 {
    private final Production27_282 production = new Production27_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}