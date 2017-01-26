package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_76 {
    private final Production33_76 production = new Production33_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}