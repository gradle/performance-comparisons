package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_427 {
    private final Production46_427 production = new Production46_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}