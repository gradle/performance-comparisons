package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_173 {
    private final Production64_173 production = new Production64_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}