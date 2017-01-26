package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_109 {
    private final Production64_109 production = new Production64_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}