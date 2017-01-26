package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_49 {
    private final Production85_49 production = new Production85_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}