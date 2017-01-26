package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_427 {
    private final Production33_427 production = new Production33_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}