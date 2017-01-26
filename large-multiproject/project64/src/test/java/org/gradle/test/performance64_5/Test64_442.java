package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_442 {
    private final Production64_442 production = new Production64_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}