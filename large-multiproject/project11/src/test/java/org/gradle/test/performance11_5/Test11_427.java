package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_427 {
    private final Production11_427 production = new Production11_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}