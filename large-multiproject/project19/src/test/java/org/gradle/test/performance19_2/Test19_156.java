package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_156 {
    private final Production19_156 production = new Production19_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}