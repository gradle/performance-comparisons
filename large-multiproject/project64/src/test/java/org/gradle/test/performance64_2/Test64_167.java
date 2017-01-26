package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_167 {
    private final Production64_167 production = new Production64_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}