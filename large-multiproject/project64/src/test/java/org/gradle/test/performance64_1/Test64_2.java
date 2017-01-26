package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_2 {
    private final Production64_2 production = new Production64_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}