package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_85 {
    private final Production81_85 production = new Production81_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}