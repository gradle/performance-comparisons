package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_49 {
    private final Production73_49 production = new Production73_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}