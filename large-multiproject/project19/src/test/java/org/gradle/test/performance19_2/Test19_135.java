package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_135 {
    private final Production19_135 production = new Production19_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}