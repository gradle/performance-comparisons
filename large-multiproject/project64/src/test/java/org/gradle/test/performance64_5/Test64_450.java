package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_450 {
    private final Production64_450 production = new Production64_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}