package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_267 {
    private final Production78_267 production = new Production78_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}