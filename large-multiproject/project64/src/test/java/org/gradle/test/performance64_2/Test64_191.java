package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_191 {
    private final Production64_191 production = new Production64_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}