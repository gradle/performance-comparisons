package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_127 {
    private final Production19_127 production = new Production19_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}