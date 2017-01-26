package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_432 {
    private final Production64_432 production = new Production64_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}