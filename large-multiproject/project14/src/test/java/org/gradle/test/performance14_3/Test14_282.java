package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_282 {
    private final Production14_282 production = new Production14_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}