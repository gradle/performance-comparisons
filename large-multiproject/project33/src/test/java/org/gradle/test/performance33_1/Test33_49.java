package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_49 {
    private final Production33_49 production = new Production33_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}