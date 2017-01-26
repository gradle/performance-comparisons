package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_85 {
    private final Production97_85 production = new Production97_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}