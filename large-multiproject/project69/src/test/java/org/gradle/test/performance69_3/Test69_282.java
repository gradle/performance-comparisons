package org.gradle.test.performance69_3;

import static org.junit.Assert.*;

public class Test69_282 {
    private final Production69_282 production = new Production69_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}