package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_49 {
    private final Production18_49 production = new Production18_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}