package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42215 {
    private final Productionnull_42215 production = new Productionnull_42215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}