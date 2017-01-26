package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_27 {
    private final Production64_27 production = new Production64_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}