package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_163 {
    private final Production64_163 production = new Production64_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}