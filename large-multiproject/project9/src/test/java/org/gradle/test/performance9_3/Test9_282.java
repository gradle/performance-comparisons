package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_282 {
    private final Production9_282 production = new Production9_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}