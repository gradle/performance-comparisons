package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_461 {
    private final Production38_461 production = new Production38_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}