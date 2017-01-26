package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_85 {
    private final Production11_85 production = new Production11_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}