package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_337 {
    private final Production64_337 production = new Production64_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}