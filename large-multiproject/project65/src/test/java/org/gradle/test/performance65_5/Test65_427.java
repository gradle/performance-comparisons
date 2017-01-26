package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_427 {
    private final Production65_427 production = new Production65_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}