package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_200 {
    private final Production64_200 production = new Production64_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}