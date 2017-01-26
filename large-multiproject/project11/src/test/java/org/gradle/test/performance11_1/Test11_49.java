package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_49 {
    private final Production11_49 production = new Production11_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}