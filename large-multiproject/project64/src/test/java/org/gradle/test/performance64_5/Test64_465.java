package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_465 {
    private final Production64_465 production = new Production64_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}