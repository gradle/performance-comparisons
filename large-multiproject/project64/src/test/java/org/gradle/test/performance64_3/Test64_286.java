package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_286 {
    private final Production64_286 production = new Production64_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}