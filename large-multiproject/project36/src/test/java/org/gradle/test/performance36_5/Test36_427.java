package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_427 {
    private final Production36_427 production = new Production36_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}