package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_330 {
    private final Production64_330 production = new Production64_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}