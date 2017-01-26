package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_427 {
    private final Production59_427 production = new Production59_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}