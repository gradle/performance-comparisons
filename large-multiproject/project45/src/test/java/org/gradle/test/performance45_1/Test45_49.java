package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_49 {
    private final Production45_49 production = new Production45_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}