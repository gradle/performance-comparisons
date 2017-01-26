package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_183 {
    private final Production64_183 production = new Production64_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}