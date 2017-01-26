package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_214 {
    private final Production64_214 production = new Production64_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}