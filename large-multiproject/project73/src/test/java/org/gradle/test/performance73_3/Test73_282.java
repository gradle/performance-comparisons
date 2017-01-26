package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_282 {
    private final Production73_282 production = new Production73_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}