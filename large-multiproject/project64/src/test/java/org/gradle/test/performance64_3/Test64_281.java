package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_281 {
    private final Production64_281 production = new Production64_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}