package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_137 {
    private final Production64_137 production = new Production64_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}