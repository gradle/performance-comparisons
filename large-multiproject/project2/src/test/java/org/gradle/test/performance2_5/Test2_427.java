package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_427 {
    private final Production2_427 production = new Production2_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}