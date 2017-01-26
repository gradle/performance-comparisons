package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_461 {
    private final Production78_461 production = new Production78_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}