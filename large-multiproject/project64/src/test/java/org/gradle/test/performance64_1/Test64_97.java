package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_97 {
    private final Production64_97 production = new Production64_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}