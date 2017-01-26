package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_282 {
    private final Production62_282 production = new Production62_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}