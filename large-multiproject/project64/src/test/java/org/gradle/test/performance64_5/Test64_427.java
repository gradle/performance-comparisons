package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_427 {
    private final Production64_427 production = new Production64_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}